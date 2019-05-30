# fastdfs
结合`docker建立fastDFS单机版（docker-compose.yml）`文档，可快速搭建项目

### demo内容
1、可以直接上传文件存到fasdfs服务器中；
2、可以使用缩略图上传——可以开发多种规格的缩略图；
3、可以直接上传base64位图片字符串，但注意`base64,`前面的内容不能要，同时使用`inputStream.available()`方法计算文件长度即可，不必把`base64`转化为图片再转为注
