<!-- @head-content@ -->
# laplacian/domain-model.project-template

ドメインモデルプロジェクトのディレクトリ構成、開発用スクリプト、各種ドキュメントを生成するテンプレートモジュールです。


*Read this in other languages*: [[English](README.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
- [使用方法](#使用方法)

- [インデックス](#インデックス)

  * [スクリプト一覧](#スクリプト一覧)

  * [ソースコード一覧](#ソースコード一覧)



<!-- @toc@ -->

<!-- @main-content@ -->
## 使用方法

この templateモジュールを適用するには、プロジェクト定義に以下のエントリを追加してください。
```yaml
project:
  templates:
  - group: laplacian
    name: domain-model.project-template
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
$ ./script/generate

```


## インデックス


### スクリプト一覧


- [./script/generate.sh](<./scripts/generate.sh>)

  このプロジェクト内の資源を自動生成します。
  `src/` `model/` `template/` の各ディレクトリに格納された資源をもとに自動生成を行い、その結果を`dest/` `doc/` `script/` の各ディレクトリに反映します。

  *自動生成入力ファイル*

  - `src/`
    自動生成の対象とならない静的な資源を格納します。
    このディレクトリの内容は `dest/` 配下にそのままコピーされます。

  - `model/`
    自動生成で使用されるYAMLもしくはJSON形式で記述された静的なモデルデータを格納します。

  - `template/`
    自動生成で使用されるテンプレートファイルを格納します。ファイル拡張子に `.hbs` を含むファイルがテンプレートして扱われます。
    それ以外のファイルはそのままコピーされます。

    - `template/dest` `template/doc` `template/scripts`
      これらのディレクトリはそれぞれ、`dest/` `doc/` `scripts`の各ディレクトリに出力される資源のテンプレートを格納します。

    - `template/model` `template/template`
      自動生成で使用される`template/` `model/`の内容を更新するためのテンプレートを格納します。
      自動生成の結果、`template/` `model/` の内容が更新された場合は、自動生成処理を再帰的に実行します。
      なお、上記処理中に発生した`template/` `model/`への変更は、中間状態として扱われるため、処理完了後は失われます。
      これらの中間ファイルを確認するためには *--dry-run* オプションを使用してください。

  *自動生成結果ファイル*

  - `dest/`
    自動生成の結果作成されるアプリケーションやモジュールのソースファイル等を出力します。

  - `doc/`
    プロジェクトのドキュメントを出力します。

  - `scripts/`
    開発・運用で使用する各種スクリプトを出力します。

  > Usage: generate.sh [OPTION]...
  >
  > -h, --help
  >
  >   このコマンドの使用方法を表示します。
  >   
  > -v, --verbose
  >
  >   より詳細なコマンドの実行情報を表示します。
  >   
  > -d, --dry-run
  >
  >   自動生成処理を実行後、生成されたファイルを`dest/` `doc/` `scripts/`の各フォルダに反映せずに、`.NEXT`ディレクトリに出力します。
  >   また、`.NEXT`ディレクトリの内容と現在のファイルの差異を出力します。
  >   このディレクトリには自動生成中に作成された中間ファイルも含まれます。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   自動生成処理中に`model/` `template/`ディレクトリの内容が更新された場合に、
  >   再帰的に自動生成処理を実行する回数の上限。
  >    (Default: 10)
  > , --local-module-repository [VALUE]
  >
  >   ローカルでビルドされたモジュールを格納するリポジトリのパス。
  >   ここに存在するモジュールが最優先で参照されます。
  >   
  > , --updates-scripts-only
  >
  >   スクリプトファイルのみを更新の対象とします。
  >   プロジェクトを初期生成する際、自動生成スクリプト自体を初回作成する場合などに指定します。
  >   
- [./script/publish-local.sh](<./scripts/publish-local.sh>)

  プロジェクト内の資源を自動生成した後、ディレクトリにある資源をテンプレートモジュールとしてビルドし、
  ローカルリポジトリに登録します。

  > Usage: publish-local.sh [OPTION]...
  >
  > -h, --help
  >
  >   このコマンドの使用方法を表示します。
  >   
  > -v, --verbose
  >
  >   より詳細なコマンドの実行情報を表示します。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   [generate.sh](<./scripts/generate.sh>)の同名のオプションと同じものです。
  >    (Default: 10)
  > , --skip-generation
  >
  >   自動生成処理を行わずに、ビルドおよびローカルリポジトリへの登録を行います。
  >   
  > , --local-module-repository [VALUE]
  >
  >   ビルドしたモジュールを格納するローカルリポジトリのパス。
  >   指定したパスにリポジトリが存在しない場合は、自動的に作成されます。
  >   
### ソースコード一覧


- [model/project.yaml](<./model/project.yaml>)
- [src/template/dest/domain-model-plugin/build.gradle.hbs](<./src/template/dest/domain-model-plugin/build.gradle.hbs>)
- [src/template/dest/domain-model-plugin/gradle.properties](<./src/template/dest/domain-model-plugin/gradle.properties>)
- [src/template/dest/domain-model-plugin/gradlew](<./src/template/dest/domain-model-plugin/gradlew>)
- [src/template/dest/domain-model-plugin/gradle/wrapper/gradle-wrapper.jar](<./src/template/dest/domain-model-plugin/gradle/wrapper/gradle-wrapper.jar>)
- [src/template/dest/domain-model-plugin/gradle/wrapper/gradle-wrapper.properties](<./src/template/dest/domain-model-plugin/gradle/wrapper/gradle-wrapper.properties>)
- [src/template/dest/domain-model-plugin/settings.gradle.hbs](<./src/template/dest/domain-model-plugin/settings.gradle.hbs>)
- [src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{entity.class_name}Record.kt.hbs](<./src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{entity.class_name}Record.kt.hbs>)
- [src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{entity.class_name}.kt.hbs](<./src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{entity.class_name}.kt.hbs>)
- [src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{if entity.top_level}All{upper-camel (plural entity.name)}.kt.hbs](<./src/template/dest/domain-model-plugin/src/main/kotlin/{each entities.in_namespace as entity}{path entity.namespace}/{if entity.top_level}All{upper-camel (plural entity.name)}.kt.hbs>)
- [src/template/dest/domain-model-plugin/src/main/kotlin/{path project.namespace}/gradle/{upper-camel project.name}ModelEntryResolver.kt.hbs](<./src/template/dest/domain-model-plugin/src/main/kotlin/{path project.namespace}/gradle/{upper-camel project.name}ModelEntryResolver.kt.hbs>)
- [src/template/dest/domain-model-plugin/src/main/kotlin/{path project.namespace}/gradle/{upper-camel project.name}Plugin.kt.hbs](<./src/template/dest/domain-model-plugin/src/main/kotlin/{path project.namespace}/gradle/{upper-camel project.name}Plugin.kt.hbs>)
- [src/template/{if entities}doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs](<./src/template/{if entities}doc/entities/{each entities.in_namespace as entity}{entity.class_name}.md.hbs>)
- [src/template/{if entities}doc/image/model-diagram.puml.hbs](<./src/template/{if entities}doc/image/model-diagram.puml.hbs>)
- [src/template/model/project/document/sections/{if entities}/index/entity-list.hbs.yaml](<./src/template/model/project/document/sections/{if entities}/index/entity-list.hbs.yaml>)
- [src/template/model/project/document/sections/{if entities}/overview/model-overview.hbs.yaml](<./src/template/model/project/document/sections/{if entities}/overview/model-overview.hbs.yaml>)
- [src/template/scripts/publish-local@main@.hbs.sh](<./src/template/scripts/publish-local@main@.hbs.sh>)


<!-- @main-content@ -->
