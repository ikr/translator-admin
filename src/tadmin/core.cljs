(ns tadmin.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(def app-state
  (atom {:couch-url "/couchdb/"}))

(om/root
  (fn [app owner]
    (dom/input #js {:type "text" :value (:couch-url app)}))
  app-state
  {:target (. js/document (getElementById "top"))})
