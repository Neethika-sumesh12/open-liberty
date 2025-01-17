/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package web.war.identitystores.scoped.session;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import com.ibm.ws.security.javaeesec.fat_helper.Constants;

import web.war.identitystores.BaseIdentityStore;

@SessionScoped
public class SessionScopedIdentityStore extends BaseIdentityStore implements Serializable {

    private static final long serialVersionUID = 1L;

    {
        sourceClass = SessionScopedIdentityStore.class.getName();
    }

    public SessionScopedIdentityStore() {
        expectedUser = Constants.javaeesec_basicRoleUser_sessionscoped;
    }

}
