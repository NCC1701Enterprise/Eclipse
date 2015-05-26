package eclipsenetbeans.gui.widgets;

import eclipsenetbeans.gui.Screen;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WidgetScreen implements Screen {

    private final List<Widget> widgets = new ArrayList<>();

    public void addWidget(Widget... widgets) {
        this.widgets.addAll(Arrays.asList(widgets));
    }

    public void removeWidget(Widget... widgets) {
        for (Widget w : widgets) {
            this.widgets.remove(w);
        }
    }

    @Override
    public void render(Graphics2D g2, Rectangle bounds, double off) {
        for (Widget w : widgets) {
            w.render(g2, bounds, off);
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        for (Widget w : widgets) {
            if (w instanceof Control) {
                if (w.getBounds().contains(arg0.getPoint())) {
                    ((Control) w).mousePress(arg0.getButton());
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        for (Widget w : widgets) {
            if (w instanceof Control) {
                if (w.getBounds().contains(arg0.getPoint())) {
                    ((Control) w).mouseRelease(arg0.getButton());
                }
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        for (Widget w : widgets) {
            if (w instanceof Control) {
                ((Control) w).mouseDrag(arg0.getButton(), w.getBounds().contains(arg0.getPoint()));
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        for (Widget w : widgets) {
            if (w instanceof Control) {
                ((Control) w).mouseHover(w.getBounds().contains(arg0.getPoint()));
            }
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent arg0) {
    }
}
