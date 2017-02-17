/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package org.ow2.proactive.scheduling.api.graphql.client.beans;

import static com.google.common.truth.Truth.assertThat;
import static org.ow2.proactive.scheduling.api.graphql.common.Fields.KEY;
import static org.ow2.proactive.scheduling.api.graphql.common.Fields.VALUE;

import org.junit.Test;
import org.ow2.proactive.scheduling.api.graphql.beans.input.KeyValueInput;


public class KeyValueInputTest {

    private static final String ALL = "{ " + KEY.getName() + " : \"key\" " + VALUE.getName() + " : \"value\" }";

    private static final String PARTIAL = "{ " + KEY.getName() + " : \"key\" }";

    @Test
    public void getQueryString() throws Exception {
        KeyValueInput input = new KeyValueInput.Builder().key("key").value("value").build();
        assertThat(input.getQueryString()).isEqualTo(ALL);
    }

    @Test
    public void getPartialQueryString() throws Exception {
        KeyValueInput input = new KeyValueInput.Builder().key("key").build();
        System.out.print(input.getQueryString());
        assertThat(input.getQueryString()).isEqualTo(PARTIAL);
    }

}
