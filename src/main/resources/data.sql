-- Populate vfeticr_alloy with integer atomic-percent combinations for V, Fe, Ti, Cr summing to 100.
-- Each atomic percent is stored as INTEGER.

DELETE FROM vfeticr_alloy;

WITH RECURSIVE
  v AS (
    SELECT 0 AS v
    UNION ALL
    SELECT v + 1 FROM v WHERE v < 100
  ),
  fe AS (
    SELECT v, 0 AS fe FROM v
    UNION ALL
    SELECT v, fe + 1 FROM fe WHERE fe < 100 - v
  ),
  ti AS (
    SELECT v, fe, 0 AS ti FROM fe
    UNION ALL
    SELECT v, fe, ti + 1 FROM ti WHERE ti < 100 - v - fe
  )
INSERT INTO vfeticr_alloy (v_atomic_percent, fe_atomic_percent, ti_atomic_percent, cr_atomic_percent)
SELECT v, fe, ti, 100 - v - fe - ti
FROM ti;