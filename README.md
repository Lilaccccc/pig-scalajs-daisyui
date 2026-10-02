# pig-scalajs-daisyui

> **本项目为个人自用项目**，仅用于个人学习与实验，不面向生产环境，也不保证稳定性、兼容性或后续维护。

Scala.js（Scala 3 + Laminar）配合 Vite 的前端脚手架，使用 daisyUI（基于 Tailwind CSS 4）作为样式方案。

## ⚠️ sbt 需自行下载

本仓库**不包含 sbt 发行版**。`sbt.bat` 与 `start.bat` 都依赖项目根目录下的
`sbt-2.0.9/sbt/bin/` 目录，该目录需要你自行下载并放置：

- 下载地址：<https://www.scala-sbt.org/download/>
- 下载后解压，把 sbt 发行版放到项目根目录的 `sbt-2.0.9/sbt/` 下，使以下文件存在：
  - `sbt-2.0.9/sbt/bin/sbt.bat`
  - `sbt-2.0.9/sbt/bin/sbt-launch.jar`

若你把 sbt 解压到了其他位置或使用了其他版本，请同步修改 `sbt.bat` / `start.bat` 中的路径。

## 脚本说明

| 文件 | 作用 |
| --- | --- |
| `start.bat` | 调用 `sbt-launch.jar`，执行 `~fastLinkJS`，持续监听并编译 Scala.js 产物 |
| `sbt.bat` | 调用 sbt 发行版自带的 `sbt.bat`，作为 sbt 命令入口（等价于直接使用 `sbt`） |

两者都需要先自行下载 sbt（见上一节），且都假定 sbt 位于 `./sbt-2.0.9/sbt/bin/`。

## 环境要求

- **JDK**：sbt 2.x 要求 JDK 17 及以上
- **Node.js**：Vite 8 / Tailwind CSS 4 要求 Node >= 20
- **sbt**：需自行下载，见上文

## 开发

```bash
npm install
npm run dev        # 启动 Vite 开发服务器
```

另开一个终端持续编译 Scala.js 产物：

```bash
# 若是环境变量中已配置了 sbt 则可以使用以下命令：
sbt ~fastLinkJS
# Windows 也可直接双击 `start.bat`
.\start.bat
```