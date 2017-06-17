package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * コックピット情報（利用側）リスナー.
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class DwCockpitUsageListener implements EntityListener<DwCockpitUsage> {

    @Override
    public void preInsert(final DwCockpitUsage entity, final PreInsertContext<DwCockpitUsage> context) {
    }

    @Override
    public void preUpdate(final DwCockpitUsage entity, final PreUpdateContext<DwCockpitUsage> context) {
    }

    @Override
    public void preDelete(final DwCockpitUsage entity, final PreDeleteContext<DwCockpitUsage> context) {
    }

    @Override
    public void postInsert(final DwCockpitUsage entity, final PostInsertContext<DwCockpitUsage> context) {
    }

    @Override
    public void postUpdate(final DwCockpitUsage entity, final PostUpdateContext<DwCockpitUsage> context) {
    }

    @Override
    public void postDelete(final DwCockpitUsage entity, final PostDeleteContext<DwCockpitUsage> context) {
    }
}