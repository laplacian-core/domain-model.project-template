<!-- @head-content@ -->
# laplacian/domain-model.document-template

This template generates diagrams that represents the structure of schemas
defined by the [Metamodel](https://github.com/nabla-squared/laplacian.model.metamodel).


*Read this in other languages*: [[English](README.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
1. [使用方法](#使用方法)
1. [インデックス](#インデックス)


<!-- @toc@ -->

<!-- @main-content@ -->
## 使用方法

この templateモジュールを適用するには、プロジェクト定義に以下のエントリを追加してください。
```yaml
project:
  templates:
  - group: laplacian
    name: domain-model.document-template
    version: 1.0.0
```

下記のコマンドを実行すると、このモジュールの適用によって影響を受ける資源の一覧とその内容を確認できます。

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

内容に問題が無ければ、下記コマンドを実行して変更を反映してください。

```console
$ ./script/generate --dry-run

```


## インデックス


### ソースコード一覧


- [model/project.yaml](<./model/project.yaml>)
- [src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs](<./src/doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs>)
- [src/doc/image/model-diagram.puml.hbs](<./src/doc/image/model-diagram.puml.hbs>)
- [src/model/project/document/sections/{if project.domain_model}overview.hbs.yaml](<./src/model/project/document/sections/{if project.domain_model}overview.hbs.yaml>)


<!-- @main-content@ -->