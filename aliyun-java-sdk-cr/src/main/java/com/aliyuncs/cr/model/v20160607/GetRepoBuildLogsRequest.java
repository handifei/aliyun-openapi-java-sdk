/*
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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRepoBuildLogsRequest extends RoaAcsRequest<GetRepoBuildLogsResponse> {
	
	public GetRepoBuildLogsRequest() {
		super("cr", "2016-06-07", "GetRepoBuildLogs", "cr");
		setUriPattern("/repos/[RepoNamespace]/[RepoName]/build/[BuildId]/logs");
		setMethod(MethodType.GET);
	}

	private String repoNamespace;

	private String repoName;

	private String buildId;

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		if(repoNamespace != null){
			putPathParameter("RepoNamespace", repoNamespace);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putPathParameter("RepoName", repoName);
		}
	}

	public String getBuildId() {
		return this.buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
		if(buildId != null){
			putPathParameter("BuildId", buildId);
		}
	}

	@Override
	public Class<GetRepoBuildLogsResponse> getResponseClass() {
		return GetRepoBuildLogsResponse.class;
	}

}
