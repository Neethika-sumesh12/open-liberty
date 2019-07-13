/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cache.servlet;

import javax.servlet.Servlet;

public class SingleThreadServletWrapper extends ServletWrapper implements javax.servlet.SingleThreadModel {

   private static final long serialVersionUID = 5840169883288347482L;
    
   public SingleThreadServletWrapper(Servlet s) {
      super(s);
   }

   public Class getProxiedClass() {
      return proxied.getClass();
   }

}
