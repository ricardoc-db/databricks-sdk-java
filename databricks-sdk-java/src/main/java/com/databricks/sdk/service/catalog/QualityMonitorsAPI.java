// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A monitor computes and monitors data or model quality metrics for a table over time. It generates
 * metrics tables and a dashboard that you can use to monitor table health and set alerts.
 *
 * <p>Most write operations require the user to be the owner of the table (or its parent schema or
 * parent catalog). Viewing the dashboard, computed metrics, or monitor configuration only requires
 * the user to have **SELECT** privileges on the table (along with **USE_SCHEMA** and
 * **USE_CATALOG**).
 */
@Generated
public class QualityMonitorsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(QualityMonitorsAPI.class);

  private final QualityMonitorsService impl;

  /** Regular-use constructor */
  public QualityMonitorsAPI(ApiClient apiClient) {
    impl = new QualityMonitorsImpl(apiClient);
  }

  /** Constructor for mocks */
  public QualityMonitorsAPI(QualityMonitorsService mock) {
    impl = mock;
  }

  public void cancelRefresh(String tableName, String refreshId) {
    cancelRefresh(new CancelRefreshRequest().setTableName(tableName).setRefreshId(refreshId));
  }

  /**
   * Cancel refresh.
   *
   * <p>Cancel an active monitor refresh for the given refresh ID.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  public void cancelRefresh(CancelRefreshRequest request) {
    impl.cancelRefresh(request);
  }

  public MonitorInfo create(String tableName, String assetsDir, String outputSchemaName) {
    return create(
        new CreateMonitor()
            .setTableName(tableName)
            .setAssetsDir(assetsDir)
            .setOutputSchemaName(outputSchemaName));
  }

  /**
   * Create a table monitor.
   *
   * <p>Creates a new monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog, have **USE_SCHEMA** on
   * the table's parent schema, and have **SELECT** access on the table 2. have **USE_CATALOG** on
   * the table's parent catalog, be an owner of the table's parent schema, and have **SELECT**
   * access on the table. 3. have the following permissions: - **USE_CATALOG** on the table's parent
   * catalog - **USE_SCHEMA** on the table's parent schema - be an owner of the table.
   *
   * <p>Workspace assets, such as the dashboard, will be created in the workspace where this call
   * was made.
   */
  public MonitorInfo create(CreateMonitor request) {
    return impl.create(request);
  }

  public void delete(String tableName) {
    delete(new DeleteQualityMonitorRequest().setTableName(tableName));
  }

  /**
   * Delete a table monitor.
   *
   * <p>Deletes a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   *
   * <p>Note that the metric tables and dashboard will not be deleted as part of this call; those
   * assets must be manually cleaned up (if desired).
   */
  public void delete(DeleteQualityMonitorRequest request) {
    impl.delete(request);
  }

  public MonitorInfo get(String tableName) {
    return get(new GetQualityMonitorRequest().setTableName(tableName));
  }

  /**
   * Get a table monitor.
   *
   * <p>Gets a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema. 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>The returned information includes configuration values, as well as information on assets
   * created by the monitor. Some information (e.g., dashboard) may be filtered out if the caller is
   * in a different workspace than where the monitor was created.
   */
  public MonitorInfo get(GetQualityMonitorRequest request) {
    return impl.get(request);
  }

  public MonitorRefreshInfo getRefresh(String tableName, String refreshId) {
    return getRefresh(new GetRefreshRequest().setTableName(tableName).setRefreshId(refreshId));
  }

  /**
   * Get refresh.
   *
   * <p>Gets info about a specific monitor refresh using the given refresh ID.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  public MonitorRefreshInfo getRefresh(GetRefreshRequest request) {
    return impl.getRefresh(request);
  }

  public MonitorRefreshListResponse listRefreshes(String tableName) {
    return listRefreshes(new ListRefreshesRequest().setTableName(tableName));
  }

  /**
   * List refreshes.
   *
   * <p>Gets an array containing the history of the most recent refreshes (up to 25) for this table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - **SELECT** privilege on the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  public MonitorRefreshListResponse listRefreshes(ListRefreshesRequest request) {
    return impl.listRefreshes(request);
  }

  public RegenerateDashboardResponse regenerateDashboard(String tableName) {
    return regenerateDashboard(new RegenerateDashboardRequest().setTableName(tableName));
  }

  /**
   * Regenerate a monitoring dashboard.
   *
   * <p>Regenerates the monitoring dashboard for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   *
   * <p>The call must be made from the workspace where the monitor was created. The dashboard will
   * be regenerated in the assets directory that was specified when the monitor was created.
   */
  public RegenerateDashboardResponse regenerateDashboard(RegenerateDashboardRequest request) {
    return impl.regenerateDashboard(request);
  }

  public MonitorRefreshInfo runRefresh(String tableName) {
    return runRefresh(new RunRefreshRequest().setTableName(tableName));
  }

  /**
   * Queue a metric refresh for a monitor.
   *
   * <p>Queues a metric refresh on the monitor for the specified table. The refresh will execute in
   * the background.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created.
   */
  public MonitorRefreshInfo runRefresh(RunRefreshRequest request) {
    return impl.runRefresh(request);
  }

  public MonitorInfo update(String tableName, String outputSchemaName) {
    return update(
        new UpdateMonitor().setTableName(tableName).setOutputSchemaName(outputSchemaName));
  }

  /**
   * Update a table monitor.
   *
   * <p>Updates a monitor for the specified table.
   *
   * <p>The caller must either: 1. be an owner of the table's parent catalog 2. have **USE_CATALOG**
   * on the table's parent catalog and be an owner of the table's parent schema 3. have the
   * following permissions: - **USE_CATALOG** on the table's parent catalog - **USE_SCHEMA** on the
   * table's parent schema - be an owner of the table.
   *
   * <p>Additionally, the call must be made from the workspace where the monitor was created, and
   * the caller must be the original creator of the monitor.
   *
   * <p>Certain configuration fields, such as output asset identifiers, cannot be updated.
   */
  public MonitorInfo update(UpdateMonitor request) {
    return impl.update(request);
  }

  public QualityMonitorsService impl() {
    return impl;
  }
}
