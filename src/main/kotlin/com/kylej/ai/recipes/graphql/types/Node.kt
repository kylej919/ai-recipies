package com.kylej.ai.recipes.graphql.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String
import com.kylej.ai.recipes.graphql.Generated as GraphqlGenerated
import jakarta.`annotation`.Generated as AnnotationGenerated

@AnnotationGenerated(
  value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
  date = "2024-10-20T18:06:04.033946Z",
)
@GraphqlGenerated
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Recipe::class, name = "Recipe")
])
public interface Node {
  public val id: String

  @AnnotationGenerated(
    value = ["com.netflix.graphql.dgs.codegen.CodeGen"],
    date = "2024-10-20T18:06:04.033946Z",
  )
  @GraphqlGenerated
  public companion object
}
