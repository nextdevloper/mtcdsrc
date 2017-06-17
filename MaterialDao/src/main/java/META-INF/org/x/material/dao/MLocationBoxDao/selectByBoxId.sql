select
  mb.box_id
  ,mb.box_kind
  ,mb.box_onr_id
  ,mb.capa_ind
  ,mb.box_nm
  ,mb.note
  ,mb.default_locale
  ,mb.ex_cnt
  ,mb.ins_acc
  ,mb.ins_date
  ,mb.upd_acc
  ,mb.upd_date
  ,mb.del_flg
  ,mb.rec_id
  ,ml.loc_id
  ,ml.loc_kind
  ,ml.loc_nm
  ,ml.loc_onr_id
  ,mrb.tag_a
  ,mrb.tag_b
from
((m_r_locbox mrb
inner join m_box mb on
  mrb.box_id = mb.box_id) inner join m_location ml on
mrb.loc_id = ml.loc_id)
where
  mrb.del_flg = '0'
and
  mb.del_flg = '0'
and
  ml.del_flg = '0'
/*%if srcBoxId != null */
and
  mb.box_id = /* srcBoxId */'boxid'
/*%end */
