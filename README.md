[![CircleCI](https://circleci.com/gh/nabla-squared/laplacian.template.entity.document.svg?style=shield)](https://circleci.com/gh/nabla-squared/laplacian.template.entity.document)

# laplacian:template:entity.document

This template generates a document describing a model defined with 'metamodel' model, which includes
a diagram that represents the structure of the model.



## Dependent models
This template generates resources based on the following models:

- laplacian.model.metamodel


## Getting started

Firstly, you need to add the following entry to your `laplacian-module.yml` :

```yaml
project:
  group: ${your.project.group}
  name: ${your.project.name}
  type: project
  version: "1.0.0"
  templates:
  ## ↓↓ ADD ↓↓ ##
  - group: laplacian
    name: entity
    subname: document
    version: "1.0.0"
  ## ↑↑ ADD ↑↑ ##
```

To reflect the change, you need to type the following command in your console :
```bash
./gradlew lM
```

Then put some model files under the *./model* directory and type the following command to generate files:
```bash
./gradlew lG
```