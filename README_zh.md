<!-- @head-content@ -->
# laplacian/domain-model.document-template

This template generates diagrams that represents the structure of schemas
defined by the [Metamodel](https://github.com/nabla-squared/laplacian.model.metamodel).


*Read this in other languages*: [[English](README.md)] [[日本語](README_ja.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [如何使用](#如何使用)
1. [索引](#索引)


<!-- @toc@ -->

<!-- @main-content@ -->
## 如何使用

要应用此template模块，请在项目定义中加入以下条目

```yaml
project:
  templates:
  - group: laplacian
    name: domain-model.document-template
    version: 1.0.0
```

您可以运行以下命令查看受本模块应用影响的资源列表及其内容

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

如果没有问题，请执行下面的命令来反映变化

```console
$ ./script/generate --dry-run

```


## 索引


### 源码列表


- [model/project.yaml](<./model/project.yaml>)
- [src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs](<./src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs>)
- [src/doc/image/model-diagram.puml.hbs](<./src/doc/image/model-diagram.puml.hbs>)
- [src/model/project/document/sections/{if project.domain_model}overview.hbs.yaml](<./src/model/project/document/sections/{if project.domain_model}overview.hbs.yaml>)


<!-- @main-content@ -->