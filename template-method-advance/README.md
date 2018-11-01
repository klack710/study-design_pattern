# 使い方
iterator-advanceのディレクトリ内で、

```
docker build -t java-template-method-advance .
```
でイメージを作成後、

```
docker run -it java-template-method-advance bash --login
```

でコンテナ作成とログインをしてください。

その後、コンテナ内で以下のコマンドを実行してください。

```
javac Main.java
java Main
```
