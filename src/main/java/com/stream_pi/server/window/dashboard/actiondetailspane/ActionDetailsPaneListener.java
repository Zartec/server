/*
 * Stream-Pi - Free & Open-Source Modular Cross-Platform Programmable Macro Pad
 * Copyright (C) 2019-2021  Debayan Sutradhar (rnayabed),  Samuel Quiñones (SamuelQuinones)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.stream_pi.server.window.dashboard.actiondetailspane;

import com.stream_pi.action_api.action.Action;
import com.stream_pi.server.window.dashboard.actiongridpane.ActionBox;
import com.stream_pi.util.exception.MinorException;
import javafx.stage.Window;

public interface ActionDetailsPaneListener
{
    void onActionClicked(Action action, ActionBox actionBox) throws MinorException;

    void saveAction(boolean runAsync, boolean runOnActionSavedFromServer);

    void saveAction(Action action, boolean runAsync, boolean runOnActionSavedFromServer);

    void clear();

    void setSendIcon(boolean sendIcon);

    void setAction(Action action);

    void onOpenFolderButtonClicked();

    Window getCurrentWindow();

    void refresh();

    void onDeleteButtonClicked();

    void renderAction(Action action) throws MinorException;

    void clearActionBox(int col, int row, int colSpan, int rowSpan);
}
