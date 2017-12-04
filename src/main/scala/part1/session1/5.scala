// 同じカードへのChargeを一つにまとめる
def coalesce(charges: List[Charge]): List[Charge] = {
  charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList
}
