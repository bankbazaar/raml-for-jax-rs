/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.model;

import com.google.common.base.Optional;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.xml.crypto.dsig.Transform;

public interface JaxRsMethod {

  HttpVerb getHttpVerb();

  List<MediaType> getConsumedMediaTypes();

  List<MediaType> getProducedMediaTypes();

  List<JaxRsQueryParameter> getQueryParameters();

  List<JaxRsHeaderParameter> getHeaderParameters();

  Optional<String> getDescription();

  Optional<JaxRsEntity> getConsumedEntity();

  Optional<JaxRsEntity> getProducedEntity();
}