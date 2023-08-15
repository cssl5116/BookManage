开发流程

1. 从Github拉取代码
2. 运行 `src/main/resources/team.sql`
3. 创建分支 `git switch -c 分支名`
4. 编写代码
5. 切回主分支 `git switch master`
6. 重新拉取远程仓库代码
7. 合并分支 `git merge 分支名`
8. 如果有冲突,手动处理冲突(vscode 打开项目选择是否保留代码)
9. 测试功能是否正常
10. 提交并推送代码