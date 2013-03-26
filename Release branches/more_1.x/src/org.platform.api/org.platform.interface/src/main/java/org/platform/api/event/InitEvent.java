/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.platform.api.event;
import java.util.HashMap;
import java.util.Map;
import org.platform.api.context.AppContext;
/**
 * 
 * @version : 2013-3-26
 * @author 赵永春 (zyc@byshell.org)
 */
public class InitEvent {
    private Map<String, String> initParam  = null;
    private AppContext          appContext = null;
    /**构建InitEvent对象。*/
    public InitEvent(AppContext appContext, Map<String, String> initParam) {
        this.appContext = appContext;
        this.initParam = initParam;
    }
    /**获取环境对象。*/
    public AppContext getContext() {
        return this.appContext;
    }
    /**获取上传服务初始化参数。*/
    public String getInitParameter(String name) {
        if (this.initParam == null)
            this.initParam = new HashMap<String, String>();
        if (this.initParam.containsKey(name) == true)
            return this.initParam.get(name);
        return null;
    };
    /**获取上传服务初始化参数名称集合。*/
    public String[] getInitParameterNames() {
        if (this.initParam == null)
            this.initParam = new HashMap<String, String>();
        int size = this.initParam.size();
        return this.initParam.keySet().toArray(new String[size]);
    };
}