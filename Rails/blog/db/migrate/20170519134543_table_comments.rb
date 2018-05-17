class TableComments < ActiveRecord::Migration[5.0]
  def change
  	create_table :comments
    add_column :comments, :author, :string
    add_column :comments, :content, :text
  end
end
