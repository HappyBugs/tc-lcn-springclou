# Tc-lcn 实现分布式事务

至于分布式事务和Tc-lcn是什么这里就不过多介绍，有兴趣者可以自行百度，因为网上文章实在是太多太多了，我也没那个实力说我写的就比他们好，如果按部就班的copy过来，那还不如不写，这里值得一提的就是Tc-lcn的实现原理就是使用的3pc+tcc补偿，话不多说，直接上项目。这个项目非常简单，目的就是为了模拟在分布式环境下调用其他服务的时候，出现异常，然后整体进行回滚，不会保存到数据库
