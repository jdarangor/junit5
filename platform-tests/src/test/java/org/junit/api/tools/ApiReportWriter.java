/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.api.tools;

import java.io.PrintStream;
import java.util.EnumSet;

import org.junit.platform.commons.meta.API.Usage;

/**
 * @since 1.0
 */
interface ApiReportWriter {

	void printReportHeader(PrintStream out);

	void printDeclarationInfo(PrintStream out, EnumSet<Usage> usages);

}
