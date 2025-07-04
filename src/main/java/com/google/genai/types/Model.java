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
import java.util.Map;
import java.util.Optional;

/** A trained machine learning model. */
@AutoValue
@JsonDeserialize(builder = Model.Builder.class)
public abstract class Model extends JsonSerializable {
  /** Resource name of the model. */
  @JsonProperty("name")
  public abstract Optional<String> name();

  /** Display name of the model. */
  @JsonProperty("displayName")
  public abstract Optional<String> displayName();

  /** Description of the model. */
  @JsonProperty("description")
  public abstract Optional<String> description();

  /**
   * Version ID of the model. A new version is committed when a new model version is uploaded or
   * trained under an existing model ID. The version ID is an auto-incrementing decimal number in
   * string representation.
   */
  @JsonProperty("version")
  public abstract Optional<String> version();

  /**
   * List of deployed models created from this base model. Note that a model could have been
   * deployed to endpoints in different locations.
   */
  @JsonProperty("endpoints")
  public abstract Optional<List<Endpoint>> endpoints();

  /** Labels with user-defined metadata to organize your models. */
  @JsonProperty("labels")
  public abstract Optional<Map<String, String>> labels();

  /** Information about the tuned model from the base model. */
  @JsonProperty("tunedModelInfo")
  public abstract Optional<TunedModelInfo> tunedModelInfo();

  /** The maximum number of input tokens that the model can handle. */
  @JsonProperty("inputTokenLimit")
  public abstract Optional<Integer> inputTokenLimit();

  /** The maximum number of output tokens that the model can generate. */
  @JsonProperty("outputTokenLimit")
  public abstract Optional<Integer> outputTokenLimit();

  /** List of actions that are supported by the model. */
  @JsonProperty("supportedActions")
  public abstract Optional<List<String>> supportedActions();

  /** The default checkpoint id of a model version. */
  @JsonProperty("defaultCheckpointId")
  public abstract Optional<String> defaultCheckpointId();

  /** The checkpoints of the model. */
  @JsonProperty("checkpoints")
  public abstract Optional<List<Checkpoint>> checkpoints();

  /** Instantiates a builder for Model. */
  public static Builder builder() {
    return new AutoValue_Model.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for Model. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `Model.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_Model.Builder();
    }

    /**
     * Setter for name.
     *
     * <p>name: Resource name of the model.
     */
    @JsonProperty("name")
    public abstract Builder name(String name);

    /**
     * Setter for displayName.
     *
     * <p>displayName: Display name of the model.
     */
    @JsonProperty("displayName")
    public abstract Builder displayName(String displayName);

    /**
     * Setter for description.
     *
     * <p>description: Description of the model.
     */
    @JsonProperty("description")
    public abstract Builder description(String description);

    /**
     * Setter for version.
     *
     * <p>version: Version ID of the model. A new version is committed when a new model version is
     * uploaded or trained under an existing model ID. The version ID is an auto-incrementing
     * decimal number in string representation.
     */
    @JsonProperty("version")
    public abstract Builder version(String version);

    /**
     * Setter for endpoints.
     *
     * <p>endpoints: List of deployed models created from this base model. Note that a model could
     * have been deployed to endpoints in different locations.
     */
    @JsonProperty("endpoints")
    public abstract Builder endpoints(List<Endpoint> endpoints);

    /**
     * Setter for endpoints.
     *
     * <p>endpoints: List of deployed models created from this base model. Note that a model could
     * have been deployed to endpoints in different locations.
     */
    public Builder endpoints(Endpoint... endpoints) {
      return endpoints(Arrays.asList(endpoints));
    }

    /**
     * Setter for endpoints builder.
     *
     * <p>endpoints: List of deployed models created from this base model. Note that a model could
     * have been deployed to endpoints in different locations.
     */
    public Builder endpoints(Endpoint.Builder... endpointsBuilders) {
      return endpoints(
          Arrays.asList(endpointsBuilders).stream()
              .map(Endpoint.Builder::build)
              .collect(toImmutableList()));
    }

    /**
     * Setter for labels.
     *
     * <p>labels: Labels with user-defined metadata to organize your models.
     */
    @JsonProperty("labels")
    public abstract Builder labels(Map<String, String> labels);

    /**
     * Setter for tunedModelInfo.
     *
     * <p>tunedModelInfo: Information about the tuned model from the base model.
     */
    @JsonProperty("tunedModelInfo")
    public abstract Builder tunedModelInfo(TunedModelInfo tunedModelInfo);

    /**
     * Setter for tunedModelInfo builder.
     *
     * <p>tunedModelInfo: Information about the tuned model from the base model.
     */
    public Builder tunedModelInfo(TunedModelInfo.Builder tunedModelInfoBuilder) {
      return tunedModelInfo(tunedModelInfoBuilder.build());
    }

    /**
     * Setter for inputTokenLimit.
     *
     * <p>inputTokenLimit: The maximum number of input tokens that the model can handle.
     */
    @JsonProperty("inputTokenLimit")
    public abstract Builder inputTokenLimit(Integer inputTokenLimit);

    /**
     * Setter for outputTokenLimit.
     *
     * <p>outputTokenLimit: The maximum number of output tokens that the model can generate.
     */
    @JsonProperty("outputTokenLimit")
    public abstract Builder outputTokenLimit(Integer outputTokenLimit);

    /**
     * Setter for supportedActions.
     *
     * <p>supportedActions: List of actions that are supported by the model.
     */
    @JsonProperty("supportedActions")
    public abstract Builder supportedActions(List<String> supportedActions);

    /**
     * Setter for supportedActions.
     *
     * <p>supportedActions: List of actions that are supported by the model.
     */
    public Builder supportedActions(String... supportedActions) {
      return supportedActions(Arrays.asList(supportedActions));
    }

    /**
     * Setter for defaultCheckpointId.
     *
     * <p>defaultCheckpointId: The default checkpoint id of a model version.
     */
    @JsonProperty("defaultCheckpointId")
    public abstract Builder defaultCheckpointId(String defaultCheckpointId);

    /**
     * Setter for checkpoints.
     *
     * <p>checkpoints: The checkpoints of the model.
     */
    @JsonProperty("checkpoints")
    public abstract Builder checkpoints(List<Checkpoint> checkpoints);

    /**
     * Setter for checkpoints.
     *
     * <p>checkpoints: The checkpoints of the model.
     */
    public Builder checkpoints(Checkpoint... checkpoints) {
      return checkpoints(Arrays.asList(checkpoints));
    }

    /**
     * Setter for checkpoints builder.
     *
     * <p>checkpoints: The checkpoints of the model.
     */
    public Builder checkpoints(Checkpoint.Builder... checkpointsBuilders) {
      return checkpoints(
          Arrays.asList(checkpointsBuilders).stream()
              .map(Checkpoint.Builder::build)
              .collect(toImmutableList()));
    }

    public abstract Model build();
  }

  /** Deserializes a JSON string to a Model object. */
  public static Model fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, Model.class);
  }
}
