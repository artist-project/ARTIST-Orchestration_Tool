/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.moola.logging;

public enum LogLevel {
	
	Verbose(0),
	Info(1),
	Error(2),
	Fatal(3);

	private Integer severity;

	LogLevel(int severity) {
		this.severity = severity;
	}

	public boolean isEqualOrWorseThan(LogLevel other) {
		return this.severity >= other.severity;
	}
}
