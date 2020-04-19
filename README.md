<!-- @head-content@ -->
# laplacian/schema.document-template

This template generates diagrams that represents the structure of schemas
defined by the [Metamodel](https://github.com/nabla-squared/laplacian.model.metamodel).

<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [Usage](#usage)


1. [Source list](#source-list)



<!-- @toc@ -->

<!-- @main-content@ -->
## Usage

Add the following entry to your project definition.
```yaml
project:
  templates:
  - group: laplacian
    name: schema.document-template
    version: 1.0.0
```




## Source list


[README.md](<./README.md>)

[.editorconfig](<./.editorconfig>)

[.gitattributes](<./.gitattributes>)

[.gitignore](<./.gitignore>)

[gradlew](<./gradlew>)

[model/project/sources.yaml](<./model/project/sources.yaml>)

[model/project.yaml](<./model/project.yaml>)

[src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs](<./src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs>)

[src/doc/image/model-diagram.puml.hbs](<./src/doc/image/model-diagram.puml.hbs>)





<!-- @main-content@ -->