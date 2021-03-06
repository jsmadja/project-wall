/**
 * Copyright (C) 2010 Julien SMADJA <julien dot smadja at gmail dot com> - Arnaud LEMAIRE <alemaire at norad dot fr>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.awired.visuwall.api.domain;

import com.google.common.base.Objects;

public final class TestResult {

    private int failCount;
    private int passCount;
    private int skipCount;
    private int totalCount;
    private int integrationTestCount;

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public int getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(int skipCount) {
        this.skipCount = skipCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getIntegrationTestCount() {
        return integrationTestCount;
    }

    public void setIntegrationTestCount(int integrationTestCount) {
        this.integrationTestCount = integrationTestCount;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
        .add("failCount", failCount) //
        .add("integrationTestCount", integrationTestCount) //
        .add("passCount", passCount) //
        .add("skipCount", skipCount) //
        .add("totalCount", totalCount)
        .toString();
    }

}
