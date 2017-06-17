package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * メッセージ送信履歴リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class TMsgSendListener implements EntityListener<TMsgSend> {

    @Override
    public void preInsert(final TMsgSend entity, final PreInsertContext<TMsgSend> context) {
    }

    @Override
    public void preUpdate(final TMsgSend entity, final PreUpdateContext<TMsgSend> context) {
    }

    @Override
    public void preDelete(final TMsgSend entity, final PreDeleteContext<TMsgSend> context) {
    }

    @Override
    public void postInsert(final TMsgSend entity, final PostInsertContext<TMsgSend> context) {
    }

    @Override
    public void postUpdate(final TMsgSend entity, final PostUpdateContext<TMsgSend> context) {
    }

    @Override
    public void postDelete(final TMsgSend entity, final PostDeleteContext<TMsgSend> context) {
    }
}