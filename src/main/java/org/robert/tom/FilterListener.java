package org.robert.tom;

import java.util.EventListener;

public interface FilterListener extends EventListener {
    public void filterEventOccurred(FilterEvent event);
}