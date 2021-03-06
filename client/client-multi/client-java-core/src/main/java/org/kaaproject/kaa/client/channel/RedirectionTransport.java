/*
 * Copyright 2014-2016 CyberVision, Inc.
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

package org.kaaproject.kaa.client.channel;

import org.kaaproject.kaa.client.bootstrap.BootstrapManager;
import org.kaaproject.kaa.common.endpoint.gen.RedirectSyncResponse;

/**
 * Transport for processing the Redirection response from server.
 *
 * @author Yaroslav Zeygerman
 *
 */
public interface RedirectionTransport {

    /**
     * Sets the given Bootstrap manager.
     *
     * @param manager the Bootstrap manager to be set.
     * @see BootstrapManager
     *
     */
    void setBootstrapManager(BootstrapManager manager);

    /**
     * Retrieves the redirection info from the response and passes it
     * to Bootstrap manager.
     *
     * @param response the response from the server.
     * @see RedirectSyncResponse
     *
     */
    void onRedirectionResponse(RedirectSyncResponse response);

}
