/*
 * This File is apart of Technium
 * Copyright (c) 2013 - 2015, David Swift a.k.a Severed_Infinity, Severed-Infinity, Severed
 * Infinity, All rights reserved.
 *
 * Technium is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Technium is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Technium.  If not, see <http://www.gnu.org/licenses/lgpl>.
 *
 * LogHelper.java was created 15/2/2015 and last updated 2/15/15 8:48 PM
 */
package com.severedinfinity.technium.utility;

import com.severedinfinity.technium.reference.Reference;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    public static Logger logger;

    private static void log(Level logLevel, Object object) {
        logger.log(logLevel, Reference.MOD_NAME, String.valueOf(object));
    }

    public static void all(Object object) {
        log(Level.ALL, object);
    }

    public static void debug(Object object) {
        log(Level.DEBUG, object);
    }

    public static void error(Object object) {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }

    public static void info(Object object) {
        log(Level.INFO, object);
    }

    public static void off(Object object) {
        log(Level.OFF, object);
    }

    public static void trace(Object object) {
        log(Level.TRACE, object);
    }

    public static void warn(Object object) {
        log(Level.WARN, object);
    }
}
