select
  acc_id,
  acc_id_send,
  msg_no,
  msg_title,
  msg_note,
  default_locale,
  ex_cnt,
  ins_acc,
  ins_date,
  upd_acc,
  upd_date,
  del_flg
from
  t_msg_send_news
where
  del_flg = '0'
order by
  msg_no desc
