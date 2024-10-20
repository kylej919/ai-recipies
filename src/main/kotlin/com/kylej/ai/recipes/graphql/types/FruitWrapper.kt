package com.kylej.ai.recipes.graphql.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import com.kylej.ai.recipes.graphql.Generated as GraphqlGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T18:06:04.033946Z",
)
@GraphqlGenerated
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class FruitWrapper(
  @JsonProperty("fruit")
  public val fruit: Fruit,
) : Ingredient {
  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @GraphqlGenerated
  public companion object
}
