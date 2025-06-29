/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Auto-generated code. Do not edit.

package com.google.genai.types;

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Response for the embed_content method. */
@AutoValue
@JsonDeserialize(builder = EmbedContentResponse.Builder.class)
public abstract class EmbedContentResponse extends JsonSerializable {
  /** The embeddings for each request, in the same order as provided in the batch request. */
  @JsonProperty("embeddings")
  public abstract Optional<List<ContentEmbedding>> embeddings();

  /** Vertex API only. Metadata about the request. */
  @JsonProperty("metadata")
  public abstract Optional<EmbedContentMetadata> metadata();

  /** Instantiates a builder for EmbedContentResponse. */
  public static Builder builder() {
    return new AutoValue_EmbedContentResponse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for EmbedContentResponse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `EmbedContentResponse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_EmbedContentResponse.Builder();
    }

    /**
     * Setter for embeddings.
     *
     * <p>embeddings: The embeddings for each request, in the same order as provided in the batch
     * request.
     */
    @JsonProperty("embeddings")
    public abstract Builder embeddings(List<ContentEmbedding> embeddings);

    /**
     * Setter for embeddings.
     *
     * <p>embeddings: The embeddings for each request, in the same order as provided in the batch
     * request.
     */
    public Builder embeddings(ContentEmbedding... embeddings) {
      return embeddings(Arrays.asList(embeddings));
    }

    /**
     * Setter for embeddings builder.
     *
     * <p>embeddings: The embeddings for each request, in the same order as provided in the batch
     * request.
     */
    public Builder embeddings(ContentEmbedding.Builder... embeddingsBuilders) {
      return embeddings(
          Arrays.asList(embeddingsBuilders).stream()
              .map(ContentEmbedding.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for metadata.
     *
     * <p>metadata: Vertex API only. Metadata about the request.
     */
    @JsonProperty("metadata")
    public abstract Builder metadata(EmbedContentMetadata metadata);

    /**
     * Setter for metadata builder.
     *
     * <p>metadata: Vertex API only. Metadata about the request.
     */
    public Builder metadata(EmbedContentMetadata.Builder metadataBuilder) {
      return metadata(metadataBuilder.build());
    }

    public abstract EmbedContentResponse build();
  }

  /** Deserializes a JSON string to a EmbedContentResponse object. */
  public static EmbedContentResponse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, EmbedContentResponse.class);
  }
}
