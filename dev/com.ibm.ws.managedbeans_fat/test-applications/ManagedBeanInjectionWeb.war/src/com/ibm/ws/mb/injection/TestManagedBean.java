/*******************************************************************************
 * Copyright (c) 2015, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.mb.injection;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

/**
 *
 */
@ManagedBean("TestManagedBean")
public class TestManagedBean {

    @Inject
    private TestCdiBean injectedBean;

    public String getTestString() {
        return injectedBean.getTestString();
    }

}
