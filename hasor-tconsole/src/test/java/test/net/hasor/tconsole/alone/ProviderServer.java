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
package test.net.hasor.tconsole.alone;
import net.hasor.core.ApiBinder;
import net.hasor.core.AppContext;
import net.hasor.core.Hasor;
import net.hasor.core.Module;
import net.hasor.tconsole.ConsoleApiBinder;
/**
 * 启动服务端
 * @version : 2014年9月12日
 * @author 赵永春 (zyc@hasor.net)
 */
public class ProviderServer {
    public static void main(String[] args) throws Throwable {
        //Server
        AppContext appContext = Hasor.createAppContext(new Module() {
            @Override
            public void loadModule(ApiBinder apiBinder) throws Throwable {
                apiBinder.tryCast(ConsoleApiBinder.class).addCommand(new String[] { "get" }, HelloWordExecutor.class);
                //
            }
        });
        //
        System.out.println("server start.");
        System.in.read();
    }
}