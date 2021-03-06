/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.training.osgi.factory;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.wso2.training.osgi.Hello;

public class BundleActivator implements org.osgi.framework.BundleActivator {

    ServiceRegistration<?> serviceRegistration;

    public void start(BundleContext bundleContext) throws Exception {
        ServiceFactory factory = new SampleServiceFactory();
        serviceRegistration = bundleContext.registerService(Hello.class.getName(), factory, null);
    }

    public void stop(BundleContext bundleContext) throws Exception {
        serviceRegistration.unregister();
    }
}
