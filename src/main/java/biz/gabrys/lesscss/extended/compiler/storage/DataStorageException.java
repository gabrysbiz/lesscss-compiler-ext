/*
 * Extended LessCSS Compiler
 * http://lesscss-extended-compiler.projects.gabrys.biz/
 *
 * Copyright (c) 2015 Adam Gabryś
 *
 * This file is licensed under the BSD 3-Clause (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain:
 *  - a copy of the License at project page
 *  - a template of the License at https://opensource.org/licenses/BSD-3-Clause
 */
package biz.gabrys.lesscss.extended.compiler.storage;

import biz.gabrys.lesscss.extended.compiler.ExtendedCompilerException;

/**
 * Thrown to indicate that an error occurred while accessing the storage.
 * @since 1.0
 */
public class DataStorageException extends ExtendedCompilerException {

    private static final long serialVersionUID = 4270739203731351547L;

    /**
     * Constructs a new instance with the specified detail message.
     * @param message the detail message.
     * @since 1.0
     */
    public DataStorageException(final String message) {
        super(message);
    }

    /**
     * Constructs a new instance with the specified detail message and cause.
     * @param message the detail message.
     * @param cause the cause.
     * @since 1.0
     */
    public DataStorageException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new instance with the specified cause.
     * @param cause the cause.
     * @since 1.0
     */
    public DataStorageException(final Throwable cause) {
        super(cause);
    }
}
