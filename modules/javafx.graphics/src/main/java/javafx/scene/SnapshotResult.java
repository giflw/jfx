/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene;

import javafx.scene.image.WritableImage;

/**
 * This class holds the result of a snapshot operation.
 * @since JavaFX 2.2
 */
public class SnapshotResult {
    private WritableImage image;
    private Object source;
    private SnapshotParameters params;

    // Package scope constructor
    SnapshotResult(WritableImage image, Object source, SnapshotParameters params) {
        this.image = image;
        this.source = source;
        this.params = params;
    }

    /**
     * Gets the image generated by the snapshot operation.
     *
     * @return the generated image
     */
    public WritableImage getImage() {
        return image;
    }

    /**
     * Gets the source Node or Scene on which the snapshot was called.
     *
     * @return the source of the snapshot
     */
    public Object getSource() {
        return source;
    }

    /**
     * Gets a copy of the SnapshotParameters used to generate the snapshot.
     * This will be null in the case of snapshot being called on a Scene.
     *
     * @return a copy of the SnapshotParameters used to perform the snapshot,
     * or null
     */
    public SnapshotParameters getSnapshotParameters() {
        return params;
    }

}
