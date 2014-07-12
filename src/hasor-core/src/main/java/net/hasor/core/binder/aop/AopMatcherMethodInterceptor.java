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
package net.hasor.core.binder.aop;
import java.lang.reflect.Method;
import org.aopalliance.intercept.MethodInterceptor;
/**
 * 
 * @version : 2014年5月22日
 * @author 赵永春 (zyc@byshell.org)
 */
public interface AopMatcherMethodInterceptor extends MethodInterceptor {
    /**匹配类型*/
    public boolean matcher(Class<?> targetClass);
    /**匹配方法*/
    public boolean matcher(Method targetMethod);
}