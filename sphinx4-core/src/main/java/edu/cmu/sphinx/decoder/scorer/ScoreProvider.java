/*
 * Copyright 1999-2010 Carnegie Mellon University.  
 * Portions Copyright 2002 Sun Microsystems, Inc.  
 * Portions Copyright 2002 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 * 
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL 
 * WARRANTIES.
 *
 */

package edu.cmu.sphinx.decoder.scorer;

import edu.cmu.sphinx.frontend.Data;

/** Thing that can provide the score */
public interface ScoreProvider {

    /**
     * Provides the score
     *
     * @param data data to score
     * @return the score
     */
    public float getScore(Data data);

    /**
     * Provides component score
     *
     * @param feature data to score
     * @return the score
     */
     public float[] getComponentScore(Data feature);
}
