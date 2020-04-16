<!-- @head-content@ -->
# laplacian/schema-doc.template

This template generates diagrams that represents the structure of schemas
defined by the [Metamodel](https://github.com/nabla-squared/laplacian.model.metamodel).

<!-- @head-content@ -->

<!-- @toc -->
## Table of contents
1. [Usage](#usage)


1. [Source list](#source-list)



<!-- @toc -->

<!-- @main-content -->

## Usage

Add the following entry to your project definition.
```yaml
project:
  templates:
  - group: laplacian
    name: schema-doc.template
    version: 1.0.0
```




## Source list


[src/doc/image/model-diagram.puml.hbs](<./src/doc/image/model-diagram.puml.hbs>)

[src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs](<./src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs>)

[.editorconfig](<./.editorconfig>)

[.gitignore](<./.gitignore>)

[README.md](<./README.md>)

[.gitattributes](<./.gitattributes>)

[model/project.yaml](<./model/project.yaml>)

[model/project/sources.yaml](<./model/project/sources.yaml>)

[gradlew](<./gradlew>)




<!-- @main-content -->