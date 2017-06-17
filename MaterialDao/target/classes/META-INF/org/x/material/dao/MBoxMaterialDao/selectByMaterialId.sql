select
  mm.mt_id
  ,mm.mt_kind1
  ,mm.mt_kind2
  ,mm.mt_nm
  ,mm.mt_onr_id
  ,mm.default_locale
  ,mm.ex_cnt
  ,mm.ins_acc
  ,mm.ins_date
  ,mm.upd_acc
  ,mm.upd_date
  ,mm.del_flg
  ,mm.rec_id
  ,mb.box_id
  ,mb.box_kind
  ,mb.box_nm
  ,mb.box_onr_id
  ,mbm.tag_a
  ,mbm.tag_b
from
((m_r_boxmaterial mbm
  inner join m_material mm on
    mbm.mt_id = mm.mt_id)
  inner join m_box mb on
    mbm.box_id = mb.box_id)
where
  mbm.del_flg = '0'
and
  mm.del_flg = '0'
and
  mb.del_flg = '0'
/*%if srcMaterialId != null */
and
  mm.mt_id = /* srcMaterialId */'materialid'
/*%end */
