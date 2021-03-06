/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.admin.service;

import org.dromara.soul.admin.vo.PermissionMenuVO;

import java.util.Set;

/**
 * this is permission service.
 *
 * @author nuo-promise
 **/
public interface PermissionService {

    /**
     * get user permission menu by token.
     *
     * @param token logon ack token.
     * @return {@linkplain PermissionMenuVO}
     */
    PermissionMenuVO getPermissionMenu(String token);

    /**
     * get AuthPerm By UserName.
     *
     * @param userName user name.
     * @return {@linkplain Set}
     */
    Set<String> getAuthPermByUserName(String userName);
}
