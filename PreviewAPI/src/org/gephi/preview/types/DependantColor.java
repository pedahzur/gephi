/*
Copyright 2008-2011 Gephi
Authors : Mathieu Bastian
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.preview.types;

import java.awt.Color;

/**
 *
 * @author Mathieu Bastian
 */
public final class DependantColor {

    public enum Mode {

        PARENT, CUSTOM
    };
    private final Color customColor;
    private final Mode mode;

    public DependantColor() {
        customColor = null;
        this.mode = Mode.PARENT;
    }

    public DependantColor(Color customColor) {
        this.customColor = customColor;
        this.mode = Mode.CUSTOM;
    }

    public Color getCustomColor() {
        return customColor;
    }

    public Mode getMode() {
        return mode;
    }
    
    public Color getColor(Color parentColor) {
        if (customColor == null) {
            return parentColor;
        }
        return customColor;
    }
}
