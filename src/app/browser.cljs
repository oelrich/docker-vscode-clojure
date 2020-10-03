(ns app.browser)

(defn ^:dev/after-load start []
  (js/console.log "started"))

(defn ^:export init []
  (js/console.log "initiated")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stopped"))