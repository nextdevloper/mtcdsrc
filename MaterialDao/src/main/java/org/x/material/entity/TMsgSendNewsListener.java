package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * メッセージ送信履歴（お知らせ）リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class TMsgSendNewsListener implements EntityListener<TMsgSendNews> {

    @Override
    public void preInsert(final TMsgSendNews entity, final PreInsertContext<TMsgSendNews> context) {
    }

    @Override
    public void preUpdate(final TMsgSendNews entity, final PreUpdateContext<TMsgSendNews> context) {
    }

    @Override
    public void preDelete(final TMsgSendNews entity, final PreDeleteContext<TMsgSendNews> context) {
    }

    @Override
    public void postInsert(final TMsgSendNews entity, final PostInsertContext<TMsgSendNews> context) {
    }

    @Override
    public void postUpdate(final TMsgSendNews entity, final PostUpdateContext<TMsgSendNews> context) {
    }

    @Override
    public void postDelete(final TMsgSendNews entity, final PostDeleteContext<TMsgSendNews> context) {
    }
}