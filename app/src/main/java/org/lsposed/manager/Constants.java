/*
 * This file is part of LSPosed.
 *
 * LSPosed is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * LSPosed is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LSPosed.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2020 EdXposed Contributors
 * Copyright (C) 2021 LSPosed Contributors
 */

package org.lsposed.manager;

import android.widget.Toast;

@SuppressWarnings({"FieldCanBeLocal", "FieldMayBeFinal"})
public class Constants {
    private static int xposedApiVersion = -1;
    private static String xposedVersion = null;

    public static void showErrorToast(int type) {
        Toast.makeText(App.getInstance(), R.string.app_destroyed, Toast.LENGTH_LONG).show();
    }

    // for showing the version mismatch dialog
    public static String getXposedVersion() {
        return xposedVersion;
    }

    public static int getXposedApiVersion() {
        return xposedApiVersion;
    }
}