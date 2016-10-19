def getNum(in: Getable[Number]) = in.data.intValue
def gd = new Getable(new java.lang.Double(33.3))
getNum(gd)