with
loc_view as (
  select loc_id, loc_kind, loc_nm, loc_onr_id, postcd, address, recipient, tel1, note
  from m_location
  where
        loc_onr_id = /* accId */'accId'
     or loc_kind = '01'),
box_view as (
  select box_id, box_kind, box_onr_id, capa_ind, box_nm, note
  from m_box
  where
        box_onr_id = /* accId */'accId'
     or box_kind = '01'),
mt_view as (
  select mt_id, mt_kind1, mt_nm, mt_onr_id, tag_a, tag_b
  from m_material
  where
        mt_onr_id = /* accId */'accId'
     or mt_kind1 = '01')

select
  loc.loc_id,
  loc.loc_kind,
  loc.loc_nm,
  loc.loc_onr_id,
  loc.postcd,
  loc.address,
  loc.recipient,
  loc.tel1,
  loc.note,
  box.box_id,
  box.box_kind,
  box.box_onr_id,
  box.capa_ind,
  box.box_nm,
  box.note,
  mt.mt_id,
  mt.mt_kind1,
  mt.mt_nm,
  mt.mt_onr_id,
  mt.tag_a,
  mt.tag_b
FROM
  loc_view loc
  LEFT OUTER JOIN m_r_locbox mrl
    ON loc.loc_id = mrl.loc_id
  LEFT OUTER JOIN box_view box
    ON mrl.box_id = box.box_id
  LEFT OUTER JOIN m_r_boxmaterial mrb
    ON box.box_id = mrb.box_id
  LEFT OUTER JOIN mt_view mt
    ON mrb.mt_id = mt.mt_id
where
/*%if srcLocNm != null */
      loc.loc_nm like /* @prefix(srcLocNm) */'smith' escape '$'
/*%end*/
/*%if srcBoxNm != null */
  and box.box_nm like /* @prefix(srcBoxNm) */'smith' escape '$'
/*%end*/
/*%if srcMtrNm != null */
  and mt.mt_nm like /* @prefix(srcMtrNm) */'smith' escape '$'
/*%end*/
Order By loc.loc_nm, box.box_nm, mt.mt_nm
