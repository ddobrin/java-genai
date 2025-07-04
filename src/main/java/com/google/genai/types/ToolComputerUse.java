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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Tool to support computer use. */
@AutoValue
@JsonDeserialize(builder = ToolComputerUse.Builder.class)
public abstract class ToolComputerUse extends JsonSerializable {
  /** Required. The environment being operated. */
  @JsonProperty("environment")
  public abstract Optional<Environment> environment();

  /** Instantiates a builder for ToolComputerUse. */
  public static Builder builder() {
    return new AutoValue_ToolComputerUse.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ToolComputerUse. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ToolComputerUse.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ToolComputerUse.Builder();
    }

    /**
     * Setter for environment.
     *
     * <p>environment: Required. The environment being operated.
     */
    @JsonProperty("environment")
    public abstract Builder environment(Environment environment);

    /**
     * Setter for environment given a known enum.
     *
     * <p>environment: Required. The environment being operated.
     */
    @CanIgnoreReturnValue
    public Builder environment(Environment.Known knownType) {
      return environment(new Environment(knownType));
    }

    /**
     * Setter for environment given a string.
     *
     * <p>environment: Required. The environment being operated.
     */
    @CanIgnoreReturnValue
    public Builder environment(String environment) {
      return environment(new Environment(environment));
    }

    public abstract ToolComputerUse build();
  }

  /** Deserializes a JSON string to a ToolComputerUse object. */
  public static ToolComputerUse fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ToolComputerUse.class);
  }
}
